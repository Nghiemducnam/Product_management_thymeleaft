package code.project.controller;

import code.project.model.Product;
import code.project.service.ProductImpl;
import code.project.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    private ProductService productService = new ProductImpl();
@GetMapping("/")
    public String home (Model model){
    model.addAttribute("production", productService.findAll());
    return "home";
}

@GetMapping("/product/create")
    public String create(Model model){
    model.addAttribute("production", new Product());
    return "create";

}
@PostMapping("/product/save")
    public String save(Product product, RedirectAttributes redirect){
//       float a = product.getPrice();
//    System.out.println(a);
        product.setId((int) (Math.random()*1000));
        productService.save(product);
        redirect.addFlashAttribute("success", "Saved product successfully!");
        return "redirect:/";
}
@GetMapping("product/{id}/edit")
    public String edit(@PathVariable int id, Model model){
    model.addAttribute("product" , productService.findById(id));
    return "edit";
}
@PostMapping("product/update")
    public String update(Product product, RedirectAttributes redirect){
        productService.update(product.getId(), product);
        redirect.addFlashAttribute("message", "update successfully!");
        return "redirect:/";

}
    @GetMapping("/product/{id}/delete")
    public String deleteForm(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }
    @PostMapping("product/delete")
    public String delete(Product product, RedirectAttributes redirect){
        productService.remove(product.getId());
        redirect.addFlashAttribute("message", "Removed product");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/detail")
    public String detail (@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "Detail";
    }
//    @PostMapping("product/delete")
//    public String delete(Product product, RedirectAttributes redirect){
//        productService.remove(product.getId());
//        redirect.addFlashAttribute("message", "Removed product");
//        return "redirect:/";
//    }

}
