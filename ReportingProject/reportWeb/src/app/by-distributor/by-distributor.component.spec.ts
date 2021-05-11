import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ByDistributorComponent } from './by-distributor.component';

describe('ByDistributorComponent', () => {
  let component: ByDistributorComponent;
  let fixture: ComponentFixture<ByDistributorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ByDistributorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ByDistributorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
