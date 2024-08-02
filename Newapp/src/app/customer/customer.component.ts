import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.scss'
})
export class CustomerComponent {

  employeeArray: any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;


  employeename: string = "";
  employeeaddress: string = "";
  mobile: number = 0;

  employeeid = "";

  constructor(private http: HttpClient, public dialog: MatDialog) {
    this.getAllemployee();

  }

  getAllemployee() {

    this.http.get("http://localhost:8081/api/v1/employee/getAllEmployee")

      .subscribe((resultData: any) => {
       
        console.log(resultData);
        this.employeeArray = resultData;
      });
  }

  register() {

    let bodyData = {
      "employeename": this.employeename,
      "employeeaddress": this.employeeaddress,
      "mobile": this.mobile
    };

    this.http.post("http://localhost:8081/api/v1/employee/save", bodyData, { responseType: 'text' }).subscribe((resultData: any) => {
      console.log(resultData);
      alert("Employee Registered Successfully");
      this.getAllemployee();
      this.employeename = '';
      this.employeeaddress = '';
      this.mobile = 0;
    });
  }
  setUpdate(data: any) {
    this.employeename = data.employeename;
    this.employeeaddress = data.employeeaddress;
    this.mobile = data.mobile;
    this.employeeid = data.employeeid;
  }

  fnUpdateItem(templateRef: any, id: any) {
    let dialogRef = this.dialog.open(templateRef, { disableClose: true });


  }

  UpdateRecords() {
    let bodyData = {
      "employeeid": this.employeeid,
      "employeename": this.employeename,
      "employeeaddress": this.employeeaddress,
      "mobile": this.mobile
    };

    this.http.put("http://localhost:8081/api/v1/employee/update", bodyData, { responseType: 'text' }).subscribe((resultData: any) => {
      console.log(resultData);
      alert("Employee Registered Updateddd")
      this.getAllemployee();
      this.employeename = '';
      this.employeeaddress = '';
      this.mobile = 0;
    });
  }

  save() {
    if (this.employeeid == '') {
      this.register();
    }
    else {
      this.UpdateRecords();
    }

  }

  setDelete(data: any) {


    this.http.delete("http://localhost:8081/api/v1/employee/delete" + "/" + data.employeeid, { responseType: 'text' }).subscribe((resultData: any) => {
      console.log(resultData);
      alert("Employee Deletedddd")
      this.getAllemployee();
      this.employeename = '';
      this.employeeaddress = '';
      this.mobile = 0;

    });








    

   }

}
