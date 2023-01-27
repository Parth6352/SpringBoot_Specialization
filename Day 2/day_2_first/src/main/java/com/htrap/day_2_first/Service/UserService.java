package com.htrap.day_2_first.Service;

import com.htrap.day_2_first.DTO.UserDTO;
import com.htrap.day_2_first.Model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    ArrayList<UserModel> list = new ArrayList<>();
    Integer flag=0;
    public void addData(){
        list.add(new UserModel(1L,"Parth","Bhatia","parth.bhatia@scikey.ai","Parth.1234",190840131004L));
        list.add(new UserModel(2L,"Dhruv","Mehta","dhruv.mehta@scikey.ai","Dhruv.1234",250840131003L));
        list.add(new UserModel(3L,"Manish","Awtani","manish.awtani@scikey.ai","Manish.1234",190840131001L));
        list.add(new UserModel(4L,"Dhruv","Mojila","dhruv.mojila@scikey.ai","DhruvM.1234",190840131038L));
        list.add(new UserModel(5L,"Vidhi","Patel","vidhi.patel@scikey.ai","Patel.1234",190840131057L));
        list.add(new UserModel(6L,"Pooja","Gajjar","pooja.gajjar@scikey.ai","Pooja.1234",250840131004L));
        list.add(new UserModel(7L,"Dhruvi","Patel","dhruvi.patel@scikey.ai","Dhruvi.1234",250840131001L));
        list.add(new UserModel(8L,"Dinkel","Mistry","dinkel.mistry@scikey.ai","Dinkel.1234",190840131035L));
        list.add(new UserModel(9L,"Yashvi","Mehta","yashvi.mehta@scikey.ai","Yashvi.1234",250840131014L));
        flag=1;
    }

    UserDTO userDTO;
    UserModel userModel = new UserModel();

    ArrayList<UserDTO> userDTOArrayList = new ArrayList<>();
    public ArrayList<UserDTO> readData(){
        if(flag!= 1){
            addData();
        }
        for(UserModel userModel1 : list){
            userDTO = new UserDTO();
            userDTO.setId(userModel1.getId());
            userDTO.setFname(userModel1.getFname());
            userDTO.setEmail(userModel1.getEmail());
            userDTO.setEnroll(userModel1.getEnroll());
            userDTOArrayList.add(userDTO);
        }
        return userDTOArrayList;
    }

    public UserDTO readPerticularData(Integer id){
        if(flag!= 1){
            addData();
        }
        userDTO.setId(list.get(id).getId());
        userDTO.setFname(list.get(id).getFname());
        userDTO.setEmail(list.get(id).getEmail());
        userDTO.setEnroll(list.get(id).getEnroll());
        return userDTO;
    }

}
