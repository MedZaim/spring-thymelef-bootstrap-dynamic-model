/**
 * @author : Mohamed Zaim
 * @mailto : mohamed.zaim97@gmail.com
 * @created : 20/04/2024, Saturday
 **/

package com.smi.zaim.controlers;
import com.smi.zaim.entities.Country;
import com.smi.zaim.repositories.CantryRepo;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CantryControler {
    @Autowired
    private  CantryRepo cantryRepo;
    @GetMapping("/")
    public String showPage(Model model,@RequestParam(defaultValue = "0") int page){
        model.addAttribute("data",
                cantryRepo.findAll(PageRequest.of(page, 6)));
        model.addAttribute("currentPage", page);
        return "index";
    }
    @PostMapping("/save")
    public String seve(Country country,@RequestParam(defaultValue = "0") int page){
        cantryRepo.save(country);
        return "redirect:/?page="+page;
    }
    @GetMapping("/deleteCountry/")
    public String deleteById(@RequestParam Integer id,@RequestParam(defaultValue = "0") int page){
       System.out.println("00000000000=====>id = " + id);
        cantryRepo.deleteById(id);
        return "redirect:/?page="+page;
    }

    @GetMapping("/findOne/{id}")
    @ResponseBody
    public ResponseEntity<Country> findOne(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(cantryRepo.findById(id).get(), HttpStatus.OK);
    }
}
