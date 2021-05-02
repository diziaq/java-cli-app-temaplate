package playground.head.application;

import java.io.File;
import java.net.URI;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "template", mixinStandardHelpOptions = true, version = "0.0.1",
    description = "Demonstrates simple CLI example")
public class AppCommand implements Runnable {

  @Option(
      paramLabel = "<value of abc>",
      names = {"-a", "--abc"},
      required = true,
      arity = "1",
      description = "Sample first (required) option",
      order = 5)
  private URI first;

  @Option(
      paramLabel = "<value of xyz>",
      names = {"-x", "--xyz"},
      required = false,
      arity = "1",
      description = "Sample of second (optional) option",
      order = 6)
  private File second;

  @Override
  public void run() {
    String response = "This is a dummy response.\n" +
                          "You have passed options:\n" +
                          "first (abc) => " + first + "\n" +
                          "second (xyz) => " + second;
    System.out.println(response);
  }
}