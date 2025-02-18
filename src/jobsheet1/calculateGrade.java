package jobsheet1;

import java.util.Scanner;

public class calculateGrade {

    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        int assignment = input.nextInt();

    
        System.out.print("Masukkan Nilai Kuis: ");
        int quiz = input.nextInt();
   
        System.out.print("Masukkan Nilai UTS: ");
        int midTest = input.nextInt();

        
        System.out.print("Masukkan Nilai UAS: ");
        int finalTest = input.nextInt();

        System.out.println(ValidateInput(assignment, quiz, midTest, finalTest));
        
        System.out.print("Nlai Akhir:");
        System.out.println(calculateAverage(assignment, quiz, midTest, finalTest));

        double finalscore = calculateAverage(assignment, quiz, midTest, finalTest);
        System.out.print("Nlai Huruf: ");
        System.out.println(calculateScore(finalscore));

        input.close();
        }

        static String ValidateInput(int assignment, int quiz, int midTest, int finalTest){
            if ((assignment < 0 || assignment > 100)&&(quiz < 0 || quiz > 100)&&(midTest < 0 ||midTest > 100)&&(finalTest >= 0 ||finalTest > 100) ) {
                System.out.println("==============================");
                System.err.println("Invalid grade");
            }
            return "==============================";

    
          }

        static double calculateAverage(int assignment, int quiz, int midTest, int finalTest){
            double average = (0.2 * assignment) + (0.2 * quiz) + (0.3 * midTest) + (0.3 * finalTest);

            return average;
            
        }
        static String calculateScore(double finalscore){
            String score;
                  
            if (finalscore > 80 && finalscore <= 100) {
                score = "A";
                
            }else if (finalscore > 73 && finalscore <= 80) {
                score = "B+";
                
            }else if (finalscore > 60 && finalscore <= 73) {
                score = "B";
                
            }else if (finalscore > 50 && finalscore <= 65) {
                score = "C+";
                
            }else if (finalscore > 39 && finalscore <= 50) {
                score = "C";
                
            }else{
                 score = "E";
            }
            
            return score;
   
        }
     
}

