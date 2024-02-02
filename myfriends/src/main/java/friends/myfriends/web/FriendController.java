package friends.myfriends.web;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import friends.myfriends.domain.Friend;

@Controller 

public class FriendController {
	ArrayList<Friend>friendsList= new ArrayList<>();  

   	@RequestMapping(value = "/index", method = RequestMethod.GET)
    //=@GetMapping("/index")
    public String friendNameSubmit(@ModelAttribute Friend friend, Model model) {
      if (friend != null && friend.getFriendName() !=null)  friendsList.add(friend);

	   model.addAttribute("friend", new Friend());
	   model.addAttribute("friendsList", friendsList);
		return "greeting";
	}

   
   

}
