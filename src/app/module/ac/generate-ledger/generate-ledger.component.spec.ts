import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateLedgerComponent } from './generate-ledger.component';

describe('GenerateLedgerComponent', () => {
  let component: GenerateLedgerComponent;
  let fixture: ComponentFixture<GenerateLedgerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GenerateLedgerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GenerateLedgerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
