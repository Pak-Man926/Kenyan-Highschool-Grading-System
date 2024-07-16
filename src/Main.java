import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        String name;

        int admno;

        int Maths;

        int Eng;

        int swa;

        int phyc;

        int hist;

        int chem;

        int re;

        System.out.println("Enter your Name:");

        name = obj.nextLine();

        System.out.println("Enter your Admission number: ");

        admno = obj.nextInt();

        System.out.println("Enter your Maths marks: ");

        Maths = obj.nextInt();

        System.out.println("Enter your English marks: ");

        Eng = obj.nextInt();

        System.out.println("Enter your Kiswahili marks: ");

        swa = obj.nextInt();

        System.out.println("Enter your Physics marks: ");

        phyc =obj.nextInt();

        System.out.println("Enter your History marks: ");

        hist = obj.nextInt();

        System.out.println("Enter your Chemistry marks: ");

        chem = obj.nextInt();

        System.out.println("Enter your Religious Education marks: ");

        re = obj.nextInt();


        System.out.println("Name: " + name);
        System.out.println("Admission number: " + admno);
        System.out.println("Maths marks: " + Maths);
        System.out.println("English marks: " + Eng);
        System.out.println("Kiswahili marks: " + swa);
        System.out.println("Physics marks: " + phyc);
        System.out.println("Chemistry marks: " + chem);
        System.out.println("History marks: " + hist);
        System.out.println("Religious education marks: " + re);

        int grade = (Maths + Eng + swa + hist + chem + phyc + re) / 7;



        if (grade >=70 && grade <= 100)
            {
                System.out.println("Your grade is A: " + grade);
            }

        else if (grade >= 60 && grade <= 69)
                {
                    System.out.println("Your grade is B: " + grade);
                }

        else if (grade >= 50 && grade <= 59)
                {
                    System.out.println("Your grade is C: " + grade);
                }

        else if (grade >= 40 && grade <= 49)
                {
                    System.out.println("Your grade is C: " + grade);
                }

        else if (grade >=30 && grade <= 39)
                {
                    System.out.println("Your grade is D: " + grade);
                }

        else if (grade <= 29)
                {
                    System.out.println("Your grade is E: " + grade);
                }
        else
        {
                System.out.println("Not valid: ");
        }


    }
}