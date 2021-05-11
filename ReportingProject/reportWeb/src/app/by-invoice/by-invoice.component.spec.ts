import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ByInvoiceComponent } from './by-invoice.component';

describe('ByInvoiceComponent', () => {
  let component: ByInvoiceComponent;
  let fixture: ComponentFixture<ByInvoiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ByInvoiceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ByInvoiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
