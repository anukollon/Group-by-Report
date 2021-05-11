import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ByProductComponent } from './by-product/by-product.component';
import { ByInvoiceComponent } from './by-invoice/by-invoice.component';
import { ByDistributorComponent } from './by-distributor/by-distributor.component';
import { ByCustomerLocComponent } from './by-customer-loc/by-customer-loc.component';

const routes: Routes = [
  { path: 'product', component: ByProductComponent },
  { path: 'invoice', component: ByInvoiceComponent },
  { path: 'distributor', component: ByDistributorComponent },
  { path: 'customerLoc', component: ByCustomerLocComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
