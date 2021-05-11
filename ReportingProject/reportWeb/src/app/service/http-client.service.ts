import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
export class Report {
  constructor(
    public  productCode: string,
    public  description: string,
    public  distName: string,
    public  distAddress: string,
    public manufName: string,
    public manufAddress: string,
    public custName: string,
    public custAddress: string,
    public invoiceNum: string,
    public invoiceDate: string,
    public purchasedDate: string,
    public unitOfMeasure: string,
    public purchasedWgt: string,
    public purchasedQty: string,
    public unitPrice: string,
    public totalPrice: string
  ) {
  }
}
@Injectable({
  providedIn: 'root'
})
export class HttpClientService{

  constructor(
    private httpClient: HttpClient
  ) { }
// tslint:disable-next-line:typedef
  getByProduct(){
    this.httpClient.get('http://localhost:8080/product');
    return this.httpClient.get<Report[]>('http://localhost:8080/product');
  }
  getByInvoice() {
    this.httpClient.get('http://localhost:8080/invoice');
    return this.httpClient.get<Report[]>('http://localhost:8080/invoice');
  }
  getByDist() {
    this.httpClient.get('http://localhost:8080/distributor');
    return this.httpClient.get<Report[]>('http://localhost:8080/distributor');
  }
  getByCustomerLoc() {
    this.httpClient.get('http://localhost:8080/customerLoc');
    return this.httpClient.get<Report[]>('http://localhost:8080/customerLoc');
  }
}
