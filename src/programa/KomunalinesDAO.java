package programa;
import java.sql.*;
import java.util.ArrayList;

public class  KomunalinesDAO{
    public static void insert(Komunalines komunalines) {
        String query = "INSERT INTO komunalines (gyventojuSk, objektoTipas, objektoPlotas, rinkliava) VALUES (?,?,?,?)";


        String url = "jdbc:mysql://localhost:3306/saskaitos";

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement uzklausa = prisijungimas.prepareStatement(query);
            uzklausa.setInt(1, komunalines.getGyventojuSk());
            uzklausa.setString(2, komunalines.getObjektoTipas());
            uzklausa.setDouble(3, komunalines.getObjektoPlotas());
            uzklausa.setDouble(4, komunalines.getRinkliava());

            uzklausa.executeUpdate();
            uzklausa.close();


            System.out.println("Sukurtas naujas įrašas");
        } catch (SQLException e) {
            System.out.println("Batai. Nepavyko :)");
            e.printStackTrace();
        }
    }
    public static ArrayList<Komunalines> selectAll() {
        String query = "SELECT * FROM komunalines";
        String url = "jdbc:mysql://localhost:3306/saskaitos";
        ArrayList<Komunalines> visiDuomenys = new ArrayList<>();

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement uzklausa = prisijungimas.prepareStatement(query);
            ResultSet rezultatas = uzklausa.executeQuery(query);

            while (rezultatas.next()){
                int nr = rezultatas.getInt("nr");
                int gyventojuSk = rezultatas.getInt("gyventojuSk");
                String objektoTipas = rezultatas.getString("objektoTipas");
                double objektoPlotas = rezultatas.getDouble("objektoPlotas");
                double rinkliava = rezultatas.getDouble("rinkliava");
                rinkliava = rinkliava/12;
                visiDuomenys.add(new Komunalines(nr, gyventojuSk, objektoTipas, objektoPlotas, rinkliava));
            }

            uzklausa.close();
            System.out.println("Duomenys sėkmingai perduoti");
        } catch (SQLException e) {
            System.out.println("Batai. Nepavyko :)");
            e.printStackTrace();
        }
        return visiDuomenys;
    }
    public static ArrayList<Komunalines> sort() {
        String query = "SELECT * FROM komunalines ORDER BY gyventojuSk ASC;";
        String url = "jdbc:mysql://localhost:3306/saskaitos";
        ArrayList<Komunalines> visiDuomenys = new ArrayList<>();

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement uzklausa = prisijungimas.prepareStatement(query);
            ResultSet rezultatas = uzklausa.executeQuery(query);

            while (rezultatas.next()){
                int nr = rezultatas.getInt("nr");
                int gyventojuSk = rezultatas.getInt("gyventojuSk");
                String objektoTipas = rezultatas.getString("objektoTipas");
                double objektoPlotas = rezultatas.getDouble("objektoPlotas");
                double rinkliava = rezultatas.getDouble("rinkliava");
                rinkliava = rinkliava;
                visiDuomenys.add(new Komunalines(nr, gyventojuSk, objektoTipas, objektoPlotas, rinkliava));
            }

            uzklausa.close();
            System.out.println("Duomenys sėkmingai perduoti");
        } catch (SQLException e) {
            System.out.println("Batai. Nepavyko :)");
            e.printStackTrace();
        }
        return visiDuomenys;
    }
    public static ArrayList<Komunalines> maziausiasPlotas() {
        String query = "SELECT * FROM komunalines WHERE objektoPlotas = (SELECT MIN(objektoPlotas) FROM komunalines);";
        String url = "jdbc:mysql://localhost:3306/saskaitos";
        ArrayList<Komunalines> visiDuomenys = new ArrayList<>();

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement uzklausa = prisijungimas.prepareStatement(query);
            ResultSet rezultatas = uzklausa.executeQuery(query);

            while (rezultatas.next()){
                int nr = rezultatas.getInt("nr");
                int gyventojuSk = rezultatas.getInt("gyventojuSk");
                String objektoTipas = rezultatas.getString("objektoTipas");
                double objektoPlotas = rezultatas.getDouble("objektoPlotas");
                double rinkliava = rezultatas.getDouble("rinkliava");
                rinkliava = rinkliava;
                visiDuomenys.add(new Komunalines(nr, gyventojuSk, objektoTipas, objektoPlotas, rinkliava));
            }

            uzklausa.close();
            System.out.println("Duomenys sėkmingai perduoti");
        } catch (SQLException e) {
            System.out.println("Batai. Nepavyko :)");
            e.printStackTrace();
        }
        return visiDuomenys;
    }
    public static ArrayList<Komunalines> tikNamai() {
        String query = "SELECT * FROM komunalines WHERE objektoTipas LIKE 'Namas';";
        String url = "jdbc:mysql://localhost:3306/saskaitos";
        ArrayList<Komunalines> visiDuomenys = new ArrayList<>();

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement uzklausa = prisijungimas.prepareStatement(query);
            ResultSet rezultatas = uzklausa.executeQuery(query);

            while (rezultatas.next()){
                int nr = rezultatas.getInt("nr");
                int gyventojuSk = rezultatas.getInt("gyventojuSk");
                String objektoTipas = rezultatas.getString("objektoTipas");
                double objektoPlotas = rezultatas.getDouble("objektoPlotas");
                double rinkliava = rezultatas.getDouble("rinkliava");
                rinkliava = rinkliava;
                visiDuomenys.add(new Komunalines(nr, gyventojuSk, objektoTipas, objektoPlotas, rinkliava));
            }

            uzklausa.close();
            System.out.println("Duomenys sėkmingai perduoti");
        } catch (SQLException e) {
            System.out.println("Batai. Nepavyko :)");
            e.printStackTrace();
        }
        return visiDuomenys;
    }
}
/*public class StudentDAO {
    public static void insert(Student student) {
        String query = "INSERT INTO students (name,school,group2,average2) VALUES (?,?,?,?)";


        String url = "jdbc:mysql://localhost:3306/db";

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = prisijungimas.prepareStatement(query);
            uzklausa.setString(1, student.getVardas());
            uzklausa.setString(2, student.getMokykla());
            uzklausa.setString(3, student.getGrupe());
            uzklausa.setDouble(4, student.getVidurkis());

            uzklausa.executeUpdate();
            uzklausa.close();  // uzdaroma prisijungimas prie db


            System.out.println("Duomenys iterpti sekmingai");
        } catch (SQLException e) {
            System.out.println("Total FAIL");
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> searchById(int id) {
        String query = "SELECT * FROM students WHERE id = ?";

        String url = "jdbc:mysql://localhost:3306/db";
        ArrayList<Student>studentai=new ArrayList<Student>();

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = prisijungimas.prepareStatement(query);
            uzklausa.setInt(1, id);

            ResultSet rezultatuRinkinys = uzklausa.executeQuery();
            while (rezultatuRinkinys.next()){
                //String vardas, String grupe, double vidurkis, String mokykla, int id, String data)
                studentai.add(new Student(
                        rezultatuRinkinys.getString("name"),
                        rezultatuRinkinys.getString("group2"),
                        rezultatuRinkinys.getDouble("average2"),
                        rezultatuRinkinys.getString("school"),
                        rezultatuRinkinys.getInt("id"),
                        rezultatuRinkinys.getString("data")
                ));
            }
            uzklausa.close();  // uzdaroma prisijungimas prie db

            System.out.println("Paieska pagal ID ivykdyta sekmingai");
        } catch (SQLException e) {
            System.out.println("Paieska nesekminga");
            e.printStackTrace();
        }
        return studentai;
    }

    public static void update(Student student) {

        String query = "Update students  SET name=?,school=?,group2=?,average2=? WHERE id=?";
        String url = "jdbc:mysql://localhost:3306/db";

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = prisijungimas.prepareStatement(query);
            uzklausa.setString(1, student.getVardas());
            uzklausa.setString(2, student.getMokykla());
            uzklausa.setString(3, student.getGrupe());
            uzklausa.setDouble(4, student.getVidurkis());
            uzklausa.setInt(5,student.getId());

            uzklausa.executeUpdate();
            uzklausa.close();  // uzdaroma prisijungimas prie db

            System.out.println("Duomenys readaguoti sekmingai");
        } catch (SQLException e) {
            System.out.println("Duomenu readagavimas nepavyko");
            e.printStackTrace();
        }
    }

    public static void delete(int id) {

        String query = "DELETE FROM students WHERE id=?";
        String url = "jdbc:mysql://localhost:3306/db";

        try {
            Connection prisijungimas = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = prisijungimas.prepareStatement(query);
            uzklausa.setInt(1, id);

            uzklausa.executeUpdate();
            uzklausa.close();  // uzdaroma prisijungimas prie db

            System.out.println("Duomenys istrinti sekmingai");
        } catch (SQLException e) {
            System.out.println("Duomenu istrinti nepavyko");
            e.printStackTrace();
        }
    }
}
 */