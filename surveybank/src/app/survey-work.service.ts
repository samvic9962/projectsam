import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SurveyWork } from '../Entity/survey-work';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class SurveyWorkService {

  addEmpURL : string;
  getEmpURL : string;
  updateEmpUrl : string;
  deleteEmpUrl : string;

  constructor(private http : HttpClient) {

    this.addEmpURL = 'http://localhost:8082/postroom';
    this.getEmpURL = 'http://localhost:8082/room';
    this.updateEmpUrl = 'http://localhost:8082/updateroom';
    this.deleteEmpUrl = 'http://localhost:8082/deleteroom';

   }

   addRoom(room : SurveyWork): Observable<SurveyWork> {
     return this.http.post<SurveyWork>(this.addEmpURL,room);
   }

   getAllRoom(): Observable<SurveyWork[]>{
     return this.http.get<SurveyWork[]>(this.getEmpURL);
   }

   updateRoom(room :SurveyWork) : Observable<SurveyWork>{
     return this.http.put<SurveyWork>(this.updateEmpUrl, room);
   }
   
  findAll(): Observable<any> {
    console.log(SurveyWork)
    return this.http.get('http://localhost:8086/room');
  }

   deleteRoom(room : SurveyWork) : Observable<SurveyWork> {
     return this.http.delete<SurveyWork>(this.deleteEmpUrl+'/'+room.roomId);
   }
  

}
