import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BmdashComponent } from './bmdash.component';

describe('BmdashComponent', () => {
  let component: BmdashComponent;
  let fixture: ComponentFixture<BmdashComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BmdashComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BmdashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
