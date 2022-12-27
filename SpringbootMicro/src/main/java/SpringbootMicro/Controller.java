package SpringbootMicro;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class Controller {
	@GetMapping()
	public String getusers() {
		return "users data";
	}
	@PostMapping()
	public String addusers() {
		return "added users data";
	}
	@PutMapping()
	public String updateusers() {
		return "updated users data";
	}
	@DeleteMapping()
	public String deleteusers() {
		return "deleted users data";
	}

}
