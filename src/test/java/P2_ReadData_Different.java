import java.sql.*;

public class P2_ReadData_Different {

        //MySql de day5 de..personel tablosu


        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "4903");

            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            // ilk satirdaki ilk objeyi yazdiralim


            // ikinci satirdaki ilk objeyi yazdiralim

            
            // ilk sutundaki 5.degeri yazdiralim



            // 0.satira gitmemizin sebebi while sorgusu icerisinde bulunan resultSet.next() in bizi
            // birinci kayda goturmesi icindir. Eger 1.satira gidecek olsak while icindeki kod yuzunden yazdirmaya
            // 2.satirdan baslar, tum listeyi alamayiz

            // Tum listeyi yazdirmak istersek;












        }

}

