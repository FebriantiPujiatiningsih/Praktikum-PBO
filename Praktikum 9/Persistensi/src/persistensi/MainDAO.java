/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistensi;

/**
 *
 * @author ASUS
 */
//Febrinti Pujiatiningsih / 24060123120034
public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Febri");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }       
    }
}