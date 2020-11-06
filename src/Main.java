import java.io.*;
import java.util.Scanner;

public class Main {
    static void Task1(){
        try (FileWriter note=new FileWriter("C:\\Users\\user\\Desktop\\practical work\\pr19\\note.txt",false);) {
            Scanner scanner = new Scanner(System.in);
            note.write(scanner.nextLine());
            //note.flush();
            note.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    static void Task2(){
        try (FileReader note=new FileReader("C:\\Users\\user\\Desktop\\practical work\\pr19\\note.txt")){
            Scanner scanner=new Scanner(note);
            System.out.println(scanner.nextLine());
            note.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void Task3(){
        try (FileWriter note=new FileWriter("C:\\Users\\user\\Desktop\\practical work\\pr19\\note.txt", false);) {
            Scanner scanner = new Scanner(System.in);
            note.write(scanner.nextLine());
            note.flush();
            note.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    static void Task4() throws IOException {
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\practical work\\pr19\\note.txt", true)));
        Scanner scanner=new Scanner(System.in);
        out.println(scanner.nextLine());
        out.close();
    }
    public static void main(String[] args) throws IOException {
        Task1(); Task2();
        Task3(); Task2();
        Task4(); Task2();
    }
}
