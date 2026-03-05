import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = {7, 14, 11, 8, 9};

        SortingAlgorithms.mergeSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        LinkedStack<Integer> stack = new LinkedStack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nChoose an option:");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Peek");
            System.out.println("4 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed to stack");
                    break;

                case 2:
                    try {
                        int popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    } catch (Exception e) {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Top element: " + stack.peek());
                    } catch (Exception e) {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}