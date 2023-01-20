import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.scss'],
})
export class EmployeeComponent {
  name: string = '';
  address: string = '';
  mobile: Number = 0;

  constructor(private http: HttpClient) {}
  register() {
    let bodyData = {
      employeeName: this.name,
      employeeAddress: this.address,
      mobile: this.mobile,
    };
    console.log({ bodyData });
    this.http
      .post('http://localhost:8085/api/v1/employee/save', bodyData)
      .subscribe((response: any) => {
        console.log(response);
      });
  }

  save() {
    this.register();
  }
}
