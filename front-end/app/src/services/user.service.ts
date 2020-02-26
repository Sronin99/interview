import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {API} from "../constants/api.constantes";
import {UserDto} from "../models/user.model";

@Injectable()
export class UserService {

  constructor(private http: HttpClient) {}

  public getUserList(): Observable<UserDto[]> {
    return this.http.get<UserDto[]>(API.API_ROOT + API.USER_LIST);
  }
}
