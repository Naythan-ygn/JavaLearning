public class Chapter5
{
    public static void main(String[] args) {
        //Linear Search
//        Scanner scan = new Scanner(System.in);
//        int []a= new int[5];
//        int i;
//        for (i=0;i<5;i++){
//            System.out.print("Enter Number : ");
//            a[i]=scan.nextInt();
//        }
//        int Search;
//        boolean found=false;
//        System.out.print("Enter Search Number: ");
//        Search= scan.nextInt();
//        for (i=0;i<5;i++){
//            if (Search == a[i]) {
//                found = true;
//                System.out.println(Search + " found at " + i);
//            }
//        }
//        if (!found)//found == false
//            System.out.println("Search data is not found.");

        //Two Dimensional Array.
//        int [][] a= new int[4][5];
//        int r,c;
//        Scanner scan = new Scanner(System.in);
//        for (r=0;r<4;r++){
//            for (c=0;c<5;c++){
//                System.out.print("Enter Number: ");
//                a[r][c]= scan.nextInt();
//            }
//        }
//
//        for (r=0;r<4;r++){
//            for (c=0;c<5;c++){
//                System.out.print(a[r][c]+"\t");
//            }System.out.println();
    //    }

        //assignment 1
//        int []a=new int[101];
//        System.out.println("Original Value\t Square Value");
//        for (int i=0;i<a.length;i++){
//            System.out.println(i+"\t\t\t\t "+(i*i));
//        }

        //assignment 2
        String[] name ={"Susan","John","Marry"};
        int[][] Module ={{50,70,100},{85,94,75},{74,69,98}};
        int total=0;
        System.out.println("Name\t Module1\t\tModule2\t\tModule3\t\tTotal");
        for (int r=0;r<3;r++){
            System.out.print(name[r]+"\t\t");
            for (int c=0;c<3;c++){
                System.out.print(Module[r][c]+"\t\t\t");
                total=total+Module[r][c];
            }
            System.out.println(total);
            total=0;
        }
    }
}
