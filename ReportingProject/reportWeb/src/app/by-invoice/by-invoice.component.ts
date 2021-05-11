import { Component, OnInit } from '@angular/core';
import { HttpClientService, Report } from '../service/http-client.service';

@Component({
  selector: 'app-by-invoice',
  templateUrl: './by-invoice.component.html',
  styleUrls: ['./by-invoice.component.scss']
})
export class ByInvoiceComponent implements OnInit {

  reports: Report[];

  constructor(
    private httpClientService: HttpClientService
  ) {
  }

  ngOnInit(): void {
    this.httpClientService.getByInvoice().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }

  // tslint:disable-next-line:typedef
  handleSuccessfulResponse(response) {
    this.reports = response;
  }

}
