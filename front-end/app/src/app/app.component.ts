import {Component, OnInit} from '@angular/core';
import {UserService} from "../services/user.service";
import {UserDto} from "../models/user.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  displayList: boolean = false;
  listUsers: UserDto[];
  displayedColumns: string[] = ['userId', 'id', 'title', 'body'];

  constructor(protected userService: UserService) {
  }
  ngOnInit(): void {
  }

  getListUsers() {
    this.userService.getUserList().subscribe(result => {
      this.listUsers = result;
      this.displayList = true;
    });
  }

}
