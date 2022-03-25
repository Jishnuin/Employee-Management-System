import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  constructor(private userService:UserService) { }
public emp={
  name:'',
  design:'',
  sal:'',
  age:''


}
  ngOnInit() {
  }
  formSubmit(){
    console.log(this.emp);
    if(this.emp.name==''||this.emp.name==null)
    {
      alert('User is required');
      return;
    }
    //addemp:userservice
    this.userService.addUser(this.emp).subscribe(
      (data)=>{
console.log(data);
alert('Success');

      },
      (error)=>{
console.log(error);
alert('Something went wrong');

      }
      

    );
  }

} 
