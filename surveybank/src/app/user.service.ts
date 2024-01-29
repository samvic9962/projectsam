import { Injectable } from '@angular/core';
import { User } from '../Entity/user';
import { Observable } from 'rxjs/internal/Observable';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GuestService  {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8082/post';
  }
  findAll(): Observable<any> {
    console.log(User)
    return this.http.get('http://localhost:8082/user');
  }

  public save(user: User) {
    return this.http.post<User>(this.usersUrl, user);
  }}
