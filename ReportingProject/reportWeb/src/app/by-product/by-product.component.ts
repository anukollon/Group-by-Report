import { Component, OnInit } from '@angular/core';
import {HttpClientService, Report} from '../service/http-client.service';

@Component({
  selector: 'app-product',
  templateUrl: './by-product.component.html',
  styleUrls: ['./by-product.component.scss',
    "../../../node_modules/bootstrap/dist/css/bootstrap.min.css"]
})
export class ByProductComponent implements OnInit {

  reports: Report[];

  constructor(
    private httpClientService: HttpClientService
  ) {
  }

  ngOnInit(): void {
    this.httpClientService.getByProduct().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }

  // tslint:disable-next-line:typedef
  handleSuccessfulResponse(response) {
    this.reports = response;
  }
}
