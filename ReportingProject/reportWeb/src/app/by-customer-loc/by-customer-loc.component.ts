import { Component, OnInit } from '@angular/core';
import { HttpClientService, Report } from '../service/http-client.service';

@Component({
  selector: 'app-by-customer-loc',
  templateUrl: './by-customer-loc.component.html',
  styleUrls: ['./by-customer-loc.component.scss']
})
export class ByCustomerLocComponent implements OnInit {

  reports: Report[];

  constructor(
    private httpClientService: HttpClientService
  ) {
  }

  ngOnInit(): void {
    this.httpClientService.getByCustomerLoc().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }

  // tslint:disable-next-line:typedef
  handleSuccessfulResponse(response) {
    this.reports = response;
  }
}
