import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }
//add user
public addUser(emp:any){
  return this.http.post('${baseUrl}/emsadd/add/',emp);
}
}
