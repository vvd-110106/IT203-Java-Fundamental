import java.util.Scanner;

public class baikiemtradaugio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        formatString(s1);

        String s2 = sc.nextLine();
        findUnique(s2);

        int[] a = new int[100];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int k = sc.nextInt();
        n = insert(a, n, x, k);

        n = remove(a, n);

        int n2 = sc.nextInt();
        int[] arrA = new int[n2];
        for (int i = 0; i < n2; i++) arrA[i] = sc.nextInt();

        int m2 = sc.nextInt();
        int[] arrB = new int[m2];
        for (int i = 0; i < m2; i++) arrB[i] = sc.nextInt();

        difference(arrA, n2, arrB, m2);
    }

    public static void formatString(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder w = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                w.append(c);
            }
            else
            {
                if (w.length() > 0)
                {
                    String word = w.toString();
                    res.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1).toLowerCase())
                            .append(" ");
                    w.setLength(0);
                }
            }
        }
        if (w.length() > 0)
        {
            String word = w.toString();
            res.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase());
        }
        System.out.println(res.toString().trim());
    }

    public static void findUnique(String s) {
        for (int i = 0; i < s.length(); i++)
        {
            int count = 0;
            for (int j = 0; j < s.length(); j++)
            {
                if (s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
            }
            if (count == 1)
            {
                System.out.print(s.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    public static int insert(int[] a, int n, int x, int k) {
        for (int i = n; i > k; i--)
        {
            a[i] = a[i - 1];
        }
        a[k] = x;
        n++;
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return n;
    }

    public static int remove(int[] a, int n) {
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] == a[j])
                {
                    for (int v = j; v < n - 1; v++)
                    {
                        a[v] = a[v + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return n;
    }

    public static void difference(int[] a, int n, int[] b, int m) {
        for (int i = 0; i < n; i++)
        {
            boolean exist = false;
            for (int j = 0; j < m; j++)
            {
                if (a[i] == b[j])
                {
                    exist = true;
                    break;
                }
            }

            if (!exist)
            {
                boolean printed = false;
                for (int k = 0; k < i; k++)
                {
                    if (a[i] == a[k])
                    {
                        printed = true;
                        break;
                    }
                }
                if (!printed)
                {
                    System.out.print(a[i] + " ");
                }
            }
        }
        System.out.println();
    }
}