import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ByProductComponent } from './by-product/by-product.component';
import {HttpClientModule} from '@angular/common/http';
import { ByInvoiceComponent } from './by-invoice/by-invoice.component';
import { ByDistributorComponent } from './by-distributor/by-distributor.component';
import { ByCustomerLocComponent } from './by-customer-loc/by-customer-loc.component';

@NgModule({
  declarations: [
    AppComponent,
    ByProductComponent,
    ByInvoiceComponent,
    ByDistributorComponent,
    ByCustomerLocComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
