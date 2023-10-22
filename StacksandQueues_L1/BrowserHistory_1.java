package StacksandQueues_L1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserStack = new ArrayDeque<>();
        String line = scanner.nextLine();
        String currentUrl = "";

      while (!line.equals("Home")){
          if (line.equals("back")){
              if (!browserStack.isEmpty()){
                  currentUrl = browserStack.pop();

              }else {
                  System.out.println("no previous URLs");

                  line = scanner.nextLine();
                  continue;
              }

          }else {
              if(!currentUrl.equals("")) { browserStack.push(currentUrl); }
              currentUrl = line; }
          System.out.println(currentUrl);
          line = scanner.nextLine();
      }
   }
}
