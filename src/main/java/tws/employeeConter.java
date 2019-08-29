package tws;



import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")

public class employeeConter {
   
	@Autowired
	private EmployeeMapper employees;
	
	@GetMapping("/")
	public ResponseEntity<List<Employees>>getAll()
	{
		List<Employees> employes=employees.selectAll();
		return ResponseEntity.ok(employes);
		
	}
	
	
}
