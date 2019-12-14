import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisbursmentComponent } from './disbursment.component';

describe('DisbursmentComponent', () => {
  let component: DisbursmentComponent;
  let fixture: ComponentFixture<DisbursmentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisbursmentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisbursmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
