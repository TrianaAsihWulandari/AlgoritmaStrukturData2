
package Tugas4;
import java.util.Scanner;

public class No7_Sorting_Searching {
    public static void selectionSort(int[] A) {
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        // index of samllest element in the sublist
        for (pass = 0; pass< n - 1; pass++) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (A[j]< A[smallIndex]) {
                    smallIndex  = j;
                }
            }
            // tukar nilai terkecil dengan array[pass]
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    private static String[] search;
    public static void sequential(String[] search) {
        int B[] = {25, 7, 9, 13, 3};
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Data yang dicari : ");
        int cari = scan.nextInt();
        int ketemu = 0;
        
        System.out.println("Isi data A adalah ");
        for(int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < B.length; i++) {
            if (B[i] == cari) {
                ketemu = 1;
                System.out.print("Data yang dicari " + cari);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        
        if(ketemu == 1)
            System.out.println("Kesimpulan : Data ditemukan ");
        else 
            System.out.println("Kesimpulan : Data tidak ditemukan ");
    }
    
    public static void main(String[] args) {
        System.out.println("Triana Asih Wulandari 20090068");
        int A[] = {25,7,9,13,3};
        No7_Sorting_Searching.tampil(A);
        No7_Sorting_Searching.selectionSort(A);
        No7_Sorting_Searching.tampil(A);
        No7_Sorting_Searching.sequential(search);
    }
}

