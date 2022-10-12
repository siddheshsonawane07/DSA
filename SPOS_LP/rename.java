package SPOS_LP;

import java.util.*;

public class rename {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of pages");
        int no_of_pages = in.nextInt();
        System.out.println("Enter ");
        int n = in.nextInt();
        int[] arr = new int[no_of_pages];
        for (int i : arr) {
            System.out.println("Input " + i);
            arr[i] = in.nextInt();
        }
        System.out.println("Enter 1 for FIF");
        System.out.println("Enter 2 fdr LRU");
        System.out.println("Enter 3 for Optimal");
        System.out.print("Your Choice:  ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                int fifo = FIFO(arr, no_of_pages, n);
                System.out.println(fifo);
                break;
            case 2:
                int LRU = LRU(arr, no_of_pages, n);
                System.out.println(LRU);
                break;
            case 3:
                Optimal(arr, no_of_pages, n);
                break;
        }
    }


    public static int FIFO(int[] pages, int capacity, int n) {
        // To represent set of current pages. We use
        // an unordered_set so that we quickly check
        // if a page is present in set or not
        HashSet<Integer> s = new HashSet<>(capacity);

        // To store the pages in FIFO manner
        Queue<Integer> indexes = new LinkedList<>();

        // Start from initial page
        int page_faults = 0;
        for (int i = 0; i < n; i++) {
            // Check if the set can hold more pages
            if (s.size() < capacity) {
                // Insert it into set if not present
                // already which represents page fault
                if (!s.contains(pages[i])) {
                    s.add(pages[i]);

                    // increment page fault
                    page_faults++;

                    // Push the current page into the queue
                    indexes.add(pages[i]);
                }
            }

            // If the set is full then need to perform FIFO
            // i.e. remove the first page of the queue from
            // set and queue both and insert the current page
            else {
                // Check if current page is not already
                // present in the set
                if (!s.contains(pages[i])) {
                    //Pop the first page from the queue
                    int val = indexes.peek();

                    indexes.poll();

                    // Remove the indexes page
                    s.remove(val);

                    // insert the current page
                    s.add(pages[i]);

                    // push the current page into
                    // the queue
                    indexes.add(pages[i]);

                    // Increment page faults
                    page_faults++;
                }
            }
        }

        return page_faults;
    }


    public static int LRU(int[] pages, int n, int capacity) {
        {
            // To represent set of current pages. We use
            // an unordered_set so that we quickly check
            // if a page is present in set or not
            HashSet<Integer> s = new HashSet<>(capacity);

            // To store least recently used indexes
            // of pages.
            HashMap<Integer, Integer> indexes = new HashMap<>();

            // Start from initial page
            int page_faults = 0;
            for (int i = 0; i < n; i++) {
                // Check if the set can hold more pages
                if (s.size() < capacity) {
                    // Insert it into set if not present
                    // already which represents page fault
                    if (!s.contains(pages[i])) {
                        s.add(pages[i]);

                        // increment page fault
                        page_faults++;
                    }

                    // Store the recently used index of
                    // each page
                    indexes.put(pages[i], i);
                }

                // If the set is full then need to perform lru
                // i.e. remove the least recently used page
                // and insert the current page
                else {
                    // Check if current page is not already
                    // present in the set
                    if (!s.contains(pages[i])) {
                        // Find the least recently used pages
                        // that is present in the set
                        int lru = Integer.MAX_VALUE, val = Integer.MIN_VALUE;

                        for (int temp : s) {
                            if (indexes.get(temp) < lru) {
                                lru = indexes.get(temp);
                                val = temp;
                            }
                        }

                        // Remove the indexes page
                        s.remove(val);
                        //remove lru from hashmap
                        indexes.remove(val);
                        // insert the current page
                        s.add(pages[i]);

                        // Increment page faults
                        page_faults++;
                    }

                    // Update the current page index
                    indexes.put(pages[i], i);
                }
            }

            return page_faults;
        }
    }

    public static void Optimal(int[] pg, int pn, int fn) {
        // frames and initialize it as empty.
        int[] fr = new int[fn];

        // Traverse through page reference array
        // and check for miss and hit.
        int hit = 0;
        int index = 0;
        for (int i = 0; i < pn; i++) {

            // Page found in a frame : HIT
            if (search(pg[i], fr)) {
                hit++;
                continue;
            }

            // Page not found in a frame : MISS

            // If there is space available in frames.
            if (index < fn)
                fr[index++] = pg[i];

                // Find the page to be replaced.
            else {
                int j = predict(pg, fr, pn, i + 1);
                fr[j] = pg[i];
            }
        }
        System.out.println("No. of hits = " + hit);
        System.out.println("No. of misses = " + (pn - hit));
    }

    static boolean search(int key, int[] fr) {
        for (int j : fr)
            if (j == key)
                return true;
        return false;
    }


    public static int predict(int[] pg, int[] fr, int pn, int index) {
        // Store the index of pages which are going
        // to be used recently in future
        int res = -1, farthest = index;
        for (int i = 0; i < fr.length; i++) {
            int j;
            for (j = index; j < pn; j++) {
                if (fr[i] == pg[j]) {
                    if (j > farthest) {
                        farthest = j;
                        res = i;
                    }
                    break;
                }
            }

            // If a page is never referenced in future,
            // return it.
            if (j == pn)
                return i;
        }

        // If all of the frames were not in future,
        // return any of them, we return 0. Otherwise
        // we return res.
        return (res == -1) ? 0 : res;
    }
}
