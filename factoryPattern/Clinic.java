package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        int i = 1;
        while (i == 1) {

            PetRecord petFile = new PetRecord();
            Pet pet = null;


            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
                    break;
                case 3:
                    System.out.println("Program End");
                    i = 2;
                    break;
                default:
                    System.out.println("Wrong input!");

            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: " + petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());
            System.out.println("Play mode: " + petFile.getPet().play());


        }
    }
}
