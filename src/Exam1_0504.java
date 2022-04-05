import java.util.Scanner;

public class Exam1_0504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang so nguyen n = ");
        try {
            Integer n = Integer.parseInt(scanner.nextLine());
            Integer arr[] = new Integer[n];

            //Nhap cac phan tu cua mang
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap phan tu thu " + (i + 1) + " cua mang: ");
                try {
                    arr[i] = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Ban chua nhap dung so!!!");
                }
            }

            //In ra tong cac so chan
            Integer sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    sum = sum + arr[i];
                }
            }
            System.out.println("Tong cac so chan trong mang la: " + sum);

            //Tim a trong mang
            System.out.println("Nhap so can tim trong mang a = ");
            Integer a = Integer.parseInt(scanner.nextLine());
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == a) {
                    count = count + 1;
                    System.out.println("Tim thay " + a + " o vi tri thu " + (i + 1));
                }
            }
            if (count == 0) {
                System.out.println("Khong tim thay " + a + " trong mang");
            }

            //xoa a trong mang
            System.out.println("Nhap so can tim va xoa trong mang a = ");
            a = Integer.parseInt(scanner.nextLine());
            count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == a) {
                    for (int j = i; j < n - 1; j++) {
                        arr[i] = arr[i + 1];
                    }
                    arr[n - 1] = null;
                }
            }

            if (count == 0) {
                System.out.println("Khong tim thay " + a + " trong mang");
            } else {
                System.out.println("Mang sau khi xoa a = " + a + ":");
                for (int i = 0; i < n - count; i++) {
                    System.out.println("Phan tu thu " + (i + 1) + ":" + arr[i]);
                }
            }

            //Them b vao mang:
            System.out.println("Nhap so muon them vao mang b = ");
            try {
                Integer b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap vi tri muon them b vao:");
                try {
                    Integer p = Integer.parseInt(scanner.nextLine());
                    if (p > n + 2) {
                        System.out.println("Vuot qua chieu dai cua mang");
                    } else {
                        Integer arr1[] = new Integer[n + 1];
                        for (int i = 0; i < p - 1; i++) {
                            arr1[i] = arr[i];
                        }
                        for (int i = p; i < n; i++) {
                            arr1[i + 1] = arr[i];
                        }
                        arr1[p - 1] = b;
                    }
                    System.out.println("Mang sau khi them  b = " + b + ":");
                    for (int i = 0; i < n - count; i++) {
                        System.out.println("Phan tu thu " + (i + 1) + ":" + arr1[i]);
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Ban chua nhap dung so!!!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Ban chua nhap dung so!!!");
            }

        } catch (NumberFormatException ex) {
            System.out.println("Ban chua nhap dung so!!!");
        }

    }
}
