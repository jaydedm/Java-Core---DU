package ExerciseTryWithResources;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable {
    public void saySomething() throws IOException{
        throw new IOException("Exception from saySomethign");
        //System.out.println("Something");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("Exception from close");
       // System.out.println("close");
    }
}
