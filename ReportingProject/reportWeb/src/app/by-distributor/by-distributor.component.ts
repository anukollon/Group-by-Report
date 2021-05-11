import { Component, OnInit } from '@angular/core';
import { HttpClientService, Report } from '../service/http-client.service';


@Component({
  selector: 'app-by-distributor',
  templateUrl: './by-distributor.component.html',
  styleUrls: ['./by-distributor.component.scss']
})
export class ByDistributorComponent implements OnInit {

  reports: Report[];

  constructor(
    private httpClientService: HttpClientService
  ) {
  }

  ngOnInit(): void {
    this.httpClientService.getByDist().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }

  // tslint:disable-next-line:typedef
  handleSuccessfulResponse(response) {
    this.reports = response;
  }

}
