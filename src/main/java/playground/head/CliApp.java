package playground.head;

import picocli.CommandLine;
import playground.head.application.AppCommand;

public class CliApp {

  public static void main(String[] args) {
    new CommandLine(new AppCommand()).execute(args);
  }
}
