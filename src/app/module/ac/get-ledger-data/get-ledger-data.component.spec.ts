import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetLedgerDataComponent } from './get-ledger-data.component';

describe('GetLedgerDataComponent', () => {
  let component: GetLedgerDataComponent;
  let fixture: ComponentFixture<GetLedgerDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetLedgerDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetLedgerDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
