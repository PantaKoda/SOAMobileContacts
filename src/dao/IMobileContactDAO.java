package dao;

import java.util.List;
import model.MobileContact;

public interface IMobileContactDAO {
  MobileContact insert(MobileContact mobileContact);
  MobileContact update(long id, MobileContact mobileContact);
  void delete(long id);
  void delete(String phoneNumber);
  MobileContact get(long id);
  List<MobileContact> getAll();

  MobileContact get(String phoneNumber);
  boolean phoneNumberExists(String phoneNumber);
  boolean userIdExists(long id);
}