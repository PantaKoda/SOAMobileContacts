package service;

import dto.MobileContactInsertDTO;
import dto.MobileContactUpdateDTO;
import java.util.List;
import model.MobileContact;
import service.exceptions.ContactNotFoundException;
import service.exceptions.PhoneNumberAlreadyExistsException;
import service.exceptions.UserIdAlreadyExistsException;

public interface IMobileContactService {

  MobileContact insertMobileContact(MobileContactInsertDTO dto)
      throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

  MobileContact updateMobileContact(long id, MobileContactUpdateDTO dto)
      throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException, ContactNotFoundException;

  void deleteMobileContactById(long id) throws ContactNotFoundException;

  void deleteMobileContactByPhoneNumber(String phoneNumber) throws ContactNotFoundException;

  MobileContact getMobileContactById(long id) throws ContactNotFoundException;

  MobileContact getMobileContactByPhoneNumber(String phoneNumber)
      throws ContactNotFoundException;

  List<MobileContact> getAllMobileContacts();
}