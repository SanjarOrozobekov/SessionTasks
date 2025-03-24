package polymorphism.task3;

import java.util.Scanner;

public class Notes {
    private String[] notes;
    private int size;

    public Notes(int num) {
        this.notes = new String[num];
        this.size = size;
    }

    public void createNote(String note) {
        if (size < notes.length) {
            notes[size] = note;
            size++;
            System.out.println("Сакталды!");
        } else {
            System.out.println("Орун жок!");
        }
    }

    public void viewNotes() {
        if (size > 0) {
            System.out.println(" САКТАЛГАН ЗАМЕТКАЛАР ");
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + notes[i]);
            }
        } else if (size == 0) {
            System.out.println("Сакталган заметкалар жок.");
        }
    }

    public void editNote(int index, String newText) {
        if (index >= 0 && index < size){
            notes[index] = newText;
            System.out.println("Өзгөртүлдү!");
        }else {
            System.out.println("Номер туура эмес!");
        }
    }
    public void deleteNote(int index){
        if(index >=0 && index < size){
            for (int i = index; i < size; i++) {
                notes[i] = notes[i + 1];
            }
            notes[size - 1] = null;
            size--;
            System.out.println("Өчүрүлдү!");
        }else {
            System.out.println("Туура эмес номер!");
        }
    }
    public void notesMenu(Scanner scanner){
        while (true){
            System.out.println("\n  ЗАМЕТКАЛАР ");
            System.out.println("1. Жаңы заметка кошуу");
            System.out.println("2. Бардык заметкаларды көрүү");
            System.out.println("3. Заметканы өзгөртүү");
            System.out.println("4. Заметканы өчүрүү");
            System.out.println("5. Чыгуу");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Жаңы заметканы жазыңыз: ");
                    String note = scanner.nextLine();
                    createNote(note);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    viewNotes();
                    System.out.println("Өзгөрткүңүз келген заметканын номерин жазыңыз: ");
                    int edittIndex = scanner.nextInt() -1;
                    scanner.nextLine();
                    System.out.print("Жаңы текстти жазыңыз: ");
                    String newText = scanner.nextLine();
                    editNote(edittIndex,newText);
                    break;
                case 4:
                    viewNotes();
                    System.out.print("Өчүргүңүз келген заметканын номерин жазыңыз: ");
                    int deleteIndex = scanner.nextInt()-1;
                    deleteNote(deleteIndex);
                    break;
                case 5: return;
                default:
                    System.out.println("Туура эмес!");
            }
        }
    }
}