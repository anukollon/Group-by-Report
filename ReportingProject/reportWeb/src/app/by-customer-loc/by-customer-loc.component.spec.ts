import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ByCustomerLocComponent } from './by-customer-loc.component';

describe('ByCustomerLocComponent', () => {
  let component: ByCustomerLocComponent;
  let fixture: ComponentFixture<ByCustomerLocComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ByCustomerLocComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ByCustomerLocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
