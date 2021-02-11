import java.io.*;

public class Serializing {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Save obj = new Save();
        obj.i=4;

        File file = new File("save.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);

        FileInputStream fileInputStream =new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Save readObject = (Save) objectInputStream.readObject();
        System.out.println(readObject.i);

    }
}

class Save implements Serializable {
    int i;
}

