package helloworldmvc.model;

import java.io.IOException;

import helloworldmvc.Contract.IModel;

public class Model implements IModel {
    public DAOHelloWorld DAOHelloWorld;

    public String getHelloWorld() throws IOException {
        this.DAOHelloWorld = new DAOHelloWorld();
        return this.DAOHelloWorld.getHelloWorldMessage();
    }
}
