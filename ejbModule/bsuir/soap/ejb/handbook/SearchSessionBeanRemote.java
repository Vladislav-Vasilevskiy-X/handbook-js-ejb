
package bsuir.soap.ejb.handbook;


import javax.ejb.Remote;

@Remote
public interface SearchSessionBeanRemote {
    void addDefenition(String nameDefenition, String bodyDefenition);
    String searchDefenition(String nameDefenition);
    void updateDefenition(String nameDefenition, String bodyDefenition);
    void deleteDefenition(String nameDefenition);
    
}
