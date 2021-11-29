package yan.dong.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yan.dong.entity.Account;
import yan.dong.service.AccountService;


@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account")
    public String findAll(Model model) {

        model.addAttribute("list", accountService.findAll());

        return "list";
    }

    @RequestMapping("/insert")
    public String insert(Account account) {
        accountService.save(account);
        return "redirect:/account";
    }

    @RequestMapping("/add")
    public String returnAdd() {
        return "add";
    }

    @RequestMapping("/findById")
    public String findById(Integer id, Model model) {
        Account byId = accountService.findById(id);
        model.addAttribute("account", byId);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Account account) {
        accountService.update(account);
        return "redirect:/account";
    }

    @RequestMapping("/deleteBatch")
    public String deleteBatch(Integer[] ids) {
        accountService.deleteBatch(ids);
        return "redirect:/account";
    }

    @RequestMapping("/deleteOne")
    public String deleteOne(Integer id) {
        accountService.deleteOne(id);
        return "redirect:/account";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}