package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
    private final String  FileName          = "C:/Users/1836805/git/helloworldmvc/helloworldmaven/helloworldmvc.model/src/main/java/helloworldmvc/model/HelloWorld.txt";
    private DAOHelloWorld instance          = null;
    private String        helloWorldMessage = null;

    public DAOHelloWorld() throws IOException {
        this.readFile();
    }

    public String getHelloWorldMessage() {
        return this.helloWorldMessage;
    }

    public DAOHelloWorld getInstance() {
        return this.instance;
    }

    private void readFile() throws IOException {
        final FileReader fileReader = new FileReader(this.FileName);
        final BufferedReader bufferedReader = new BufferedReader(fileReader);
        this.setHelloWorldMessage(bufferedReader.readLine());
        bufferedReader.close();
    }

    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }

    private void setInstance(DAOHelloWorld instance) {
        this.instance = instance;
    }
}
