import { Component, OnInit } from '@angular/core';
import { Users } from '../users';
import { ApiTestServiceService } from '../api-test-service.service';

@Component({
  selector: 'app-api-test-compsant',
  templateUrl: './api-test-compsant.component.html',
  styleUrls: ['./api-test-compsant.component.scss']
})
export class ApiTestCompsantComponent implements OnInit {

  constructor(private apiTest: ApiTestServiceService) { }

  users: Users[];

  ngOnInit() {
    this.getUsersFromDB() ;
  }

  getUsersFromDB(): void {
    this.apiTest.getUsers().subscribe(users => this.users = users);
  }

}
